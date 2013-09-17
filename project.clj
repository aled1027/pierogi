(defproject pierogi "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [enlive "1.1.4"]
                 [ring "1.2.0"]]
  :plugins [[lein-ring "0.8.5"]]
  :source-paths  ["src"]
  :resource-paths ["resources"]
  :ring {:handler pierogi.controllers.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]]}})
