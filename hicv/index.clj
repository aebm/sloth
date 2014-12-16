("<!doctype html>"
 [:html
  {:lang "en"}
  [:head
   [:meta {:charset "utf-8"}]
   [:title "Open Sloth"]
   [:meta {:content "Open Sloth", :name "description"}]
   [:link {:href "/static/styles/main.css", :rel "stylesheet"}]]
  [:body
   [:section#app.client
    [:div.client-sidebar-holder
     [:div.client-sidebar
      [:div.logo "SlothLogo"]
      [:div.active-user
       [:img
        {:height "50",
         :width "50",
         :alt "#user",
         :src "/static/imgs/placerholder-avatar-1.jpg"}]
       [:div.square
        [:div.row [:h2 "Slothmachine"]]
        [:div.row
         [:div.status.online]
         " "
         "<!-- #ESTADOS:Online, Offline, Busy -->"
         [:p.status-text "Tralari tralara, traliron pompan"]]]]
      [:div.room-list.sidebar-list
       [:h3 "Channels"]
       [:ul
        [:li.unread [:span "#"] "SlothMyMachine" [:i "3"]]
        [:li.unread [:span "#"] "SlothThisShit" [:i "4"]]
        [:li [:span "#"] "SlothThugLife\n            "]]]
      [:hr]
      [:div.room-list.sidebar-list
       [:h3.nohover "Invited to this channels"]
       [:ul
        [:li.invited
         [:span "#"]
         "SlothOnElorrio"
         [:i "!"]
         [:p "By " [:a {:href "#"} "@dialelo"]]]
        [:li.invited
         [:span "#"]
         "SlothAreBadass"
         [:i "!"]
         [:p "By " [:a {:href "#"} "@mgdelacroix"]]]
        [:li.invited
         [:span "#"]
         "SlothNucelarSurvivor"
         [:i "!"]
         [:p "By " [:a {:href "#"} "@rsanchezbalo"]]]
        [:li.invited
         [:span "#"]
         "SlothSlacker"
         [:i "!"]
         [:p "By " [:a {:href "#"} "@niwibe"]]]]]]]
    [:section.client-main
     [:header
      [:h1 "#SlothMyMachine"]
      [:h2
       "Le topic del dia: Los "
       [:strong "Sloth"]
       " dominaran el mundo\n        "]]
     [:hr]
     [:div.chat-zone
      [:div.chat-container
       [:div.messages-container
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-1.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "dialelo"] [:span "10:11 pm"]]
          [:p.content "Lorem ipsum dolor sit.\n                  "]]]
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-2.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "Ramiro"] [:span "10:30 pm"]]
          [:p.content
           "  Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur ab reiciendis ducimus, iure ad, blanditiis rerum nobis, laboriosam quae repudiandae atque!\n                  "]]]
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-1.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "dialelo"] [:span "11:30 pm"]]
          [:p.content
           "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus enim est sapiente ratione impedit!\n                  "]]]
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-1.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "dialelo"] [:span "10:11 pm"]]
          [:p.content "Lorem ipsum dolor sit.\n                  "]]]
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-2.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "Ramiro"] [:span "10:30 pm"]]
          [:p.content
           "  Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur ab reiciendis ducimus, iure ad, blanditiis rerum nobis, laboriosam quae repudiandae atque!\n                  "]]]
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-1.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "dialelo"] [:span "11:30 pm"]]
          [:p.content
           "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus enim est sapiente ratione impedit!\n                  "]]]
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-1.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "dialelo"] [:span "10:11 pm"]]
          [:p.content "Lorem ipsum dolor sit.\n                  "]]]
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-2.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "Ramiro"] [:span "10:30 pm"]]
          [:p.content
           "  Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur ab reiciendis ducimus, iure ad, blanditiis rerum nobis, laboriosam quae repudiandae atque!\n                  "]]]
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-1.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "dialelo"] [:span "11:30 pm"]]
          [:p.content
           "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus enim est sapiente ratione impedit!\n                  "]]]
        [:div.message.highlighted
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-3.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "Niwibe"] [:span "12:30 pm"]]
          [:p.content
           "Lorem ipsum dolor sit amet, "
           [:strong "consectetur adipisicing"]
           " elit. Vero impedit mollitia laudantium at eos ipsa consectetur voluptatibus id. Inventore eum accusantium earum aliquid ea quidem debitis officiis dolorem. Numquam nemo veritatis placeat molestiae vitae.\n                  "]
          [:p.content
           "Lorem ipsum dolor sit amet, "
           [:em "consectetur adipisicing elit."]
           " Necessitatibus enim est sapiente ratione impedit!\n                  "]]]
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-2.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "Ramiro"] [:span "10:30 pm"]]
          [:p.content
           "  Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur ab reiciendis ducimus, iure ad, blanditiis rerum nobis, laboriosam quae repudiandae atque!\n                  "]]]
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-1.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "dialelo"] [:span "11:30 pm"]]
          [:p.content
           "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus enim est sapiente ratione impedit!\n                  "]]]
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-2.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "Ramiro"] [:span "10:30 pm"]]
          [:p.content
           "  Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur ab reiciendis ducimus, iure ad, blanditiis rerum nobis, laboriosam quae repudiandae atque!\n                  "]]]
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-1.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "dialelo"] [:span "11:30 pm"]]
          [:p.content
           "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus enim est sapiente ratione impedit!\n                  "]]]
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-2.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "Ramiro"] [:span "10:30 pm"]]
          [:p.content
           "  Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur ab reiciendis ducimus, iure ad, blanditiis rerum nobis, laboriosam quae repudiandae atque!\n                  "]]]
        [:div.message
         [:div.message-avatar
          [:img
           {:height "35",
            :width "35",
            :alt "#user",
            :src "/static/imgs/placerholder-avatar-1.jpg"}]]
         [:div.message-content
          [:div.message-title [:strong "dialelo"] [:span "11:30 pm"]]
          [:p.content
           "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus enim est sapiente ratione impedit!\n                  "]]]]
       [:div.write-message [:textarea " "] [:button "Send"]]]
      [:div.chat-sidebar-holder [:div]]]]]]])
