(defproject clojureverse "0.1.0-SNAPSHOT"
  :description "A sandbox project for me to have fun with Clojure"
  :url "http://github.com/data-miner00/clojureverse"
  :license {:name "MIT"
            :url "https://opensource.org/license/mit/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [cheshire "5.11.0"]]
  :main ^:skip-aot clojureverse.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
