(defproject clojure-service "0.1.0-SNAPSHOT"
  :description "this is a Clojure learning project"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring/ring-core "1.7.1"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [ring/ring-json "0.5.0"]
                 [compojure "1.6.1"]]
  :main clojure-service.core
  :repl-options {:init-ns clojure-service.core})
