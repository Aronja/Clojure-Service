(ns clojure-service.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [clojure.pprint :refer [pprint]]
            [compojure.core :refer [routes GET POST]]
            [compojure.route :refer [not-found]]
            [ring.middleware.json :refer [wrap-json-response wrap-json-body]]
            [ring.util.response :refer [response]]))

(def my-routes
  (routes
    (GET "/" [] "<h1>Home Page</h1>")
    (GET "/endpoint1" [] (response {:foo "bar"}))
    (GET "/endpoint2" [] (response {:marmelade "paddington"}))
    (POST "/debug" request (with-out-str (clojure.pprint/pprint request)))
    (not-found (response {:error "not-found"}))))

  (def app
    (-> my-routes
        wrap-json-body
        wrap-json-response))

  (defn -main
        "I don't do much yet"
        [& args]
        (println "Hello Clojure")
    (run-jetty app {:port 8080}))


