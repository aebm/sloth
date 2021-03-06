(defproject sloth "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "BSD (2-Clause)"
            :url "http://opensource.org/licenses/BSD-2-Clause"}
  :dependencies [[org.clojure/clojure "1.7.0-alpha5"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.clojure/tools.namespace "0.2.7"]

                 ;; Backend dependencies
                 [compojure "1.3.1"]
                 [ring/ring-core "1.3.2" :exclusions [javax.servlet/servlet-api
                                                      org.clojure/tools.reader]]
                 [cc.qbits/jet "0.5.1"]


                 ;; Frontend dependencies
                 [org.clojure/clojurescript "0.0-2665"]
                 [org.om/om "0.8.0"]
                 [secretary "1.2.1"]
                 [sablono "0.2.22" :exclusions [com.facebook/react]]
                 [hodgepodge "0.1.1" :exclusions [org.clojure/clojurescript]]
                 [cuerdas "0.1.0"]
                 [shodan "0.4.1"]

                 ;; [com.cemerick/piggieback "0.1.3"]
                 ;; [weasel "0.4.2"]

                 ;; Shared dependencies
                 [hiccup-bridge "1.0.1"]
                 [cats "0.2.0" :exclusions [org.clojure/clojure]]]

  :source-paths ["src/clj"]
  ;; :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :plugins [[lein-cljsbuild "1.0.4"]
            [hiccup-bridge "1.0.1"]]
  :cljsbuild {:builds
              [{:id "devel"
                :source-paths ["src/cljs"]
                :compiler {:output-to "resources/public/js/app.js"
                           :output-dir "resources/public/js"
                           :optimizations :none
                           :source-map true}}

               {:id "normal"
                :source-paths ["src/cljs"]
                :compiler {:output-to "resources/public/js/app.js"
                           :optimizations :whitespace
                           :pretty-print true}}

               {:id "release"
                :source-paths ["src/cljs"]
                :compiler {:output-to "resources/public/js/app.js"
                           :optimizations :advanced
                           :pretty-print false
                           :externs ["react/externs/react.js"
                                     "assets/externs/stanza.io.js"]}}]}

  :jar-exclusions [#"user.clj"]
  :target-path "target/%s"
  :profiles {:standalone {:main ^:skip-aot sloth.core}})
