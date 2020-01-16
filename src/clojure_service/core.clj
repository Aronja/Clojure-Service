(ns clojure-service.core)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body  "<h1>Hello Clojure!</h1>"})