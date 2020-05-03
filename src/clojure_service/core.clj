(ns clojure-service.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [clojure.pprint :refer [pprint]]
            [compojure.core :refer [routes GET]]
            [compojure.route :refer [not-found]]))

(defn handler [request]
  (clojure.pprint/pprint request)
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello world"})

(def my-routes
  (routes
    (GET "/" [] "<h1>Home Page</h1>")
    (GET "/endpoint1" [] "<h1>Hello from the first endpoint</h1>")
    (GET "/endpoint2" [] "<h1>Hello from the second endpoint</h1>")
    (not-found "<h1>Page not found</h1>")))

  (defn -main
        "I don't do much yet"
        [& args]
        (println "Hello Clojure")
    (run-jetty my-routes {:port 8080}))


