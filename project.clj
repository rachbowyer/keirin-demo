(defproject keirin-demo "0.1.1"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :global-vars {*warn-on-reflection* false *assert* true}

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [analemma "1.1.0"]
                 [rachbowyer/keirin "1.1.1"]]

  :main ^:skip-aot keirin-demo.core
  :target-path "target/%s"
  :profiles {:dev {:jvm-opts ^:replace ["-Xms4g" "-Xmx4g" "-server" "-Xlog:gc:gc.out" "-XX:-TieredCompilation" "-Xbatch" "-XX:CICompilerCount=1"]}
             :uberjar {:jvm-opts ^:replace ["-Dclojure.compiler.direct-linking=true"]
                       :aot :all}})

