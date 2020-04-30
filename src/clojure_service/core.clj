(ns clojure-service.core
  (:require [ring.adapter.jetty :refer [run-jetty]]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello world"})

  (defn -main
        "I don't do much yet"
        [& args]
        (println "Hello Clojure")
    (run-jetty handler {:port 8080}))


