(defproject firn "0.1.0-SNAPSHOT"
  :description "Wiki Generator"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [cheshire "5.10.0"]]
  :main ^:skip-aot firn.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
