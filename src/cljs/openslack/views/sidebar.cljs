(ns openslack.views.sidebar
  (:require [om.core :as om :include-macros true]
            [sablono.core :as s :include-macros true]
            [openslack.views.user :refer [user]]
            [openslack.views.channels :refer [channels]]
            [openslack.views.subscriptions :refer [subscriptions]]
            [openslack.views.roster :refer [roster]]))

(defn sidebar
  [state owner]
  (reify
    om/IDisplayName
    (display-name [_] "Sidebar")

    om/IRender
    (render [_]
      (s/html [:div.client-sidebar-holder
               [:div.client-sidebar
                [:div.client-lists
                 [:div.logo "SlothLogo"]
                 (om/build channels state)
                 [:hr]
                 (om/build subscriptions state)
                 [:hr]
                 (om/build roster state)]
                (om/build user state)]])))
  )
