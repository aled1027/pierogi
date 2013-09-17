(ns pierogi.controllers.handler
  (:use compojure.core
        [ring.util.response :only  [response file-response resource-response]])
  (:require [net.cgrand.enlive-html :as html]
            [compojure.handler :as handler]
            [compojure.route :as route]))

(html/deftemplate main-template "pierogi/views/general.html"
  []
  [:div#main] (html/content "Hello World!"))

(def app-routes
  [(GET "/" [] (main-template))
   (route/resources "/" {:root "public"})
   (route/not-found "Not Found")])

(def app
  (handler/site (apply routes app-routes)))
