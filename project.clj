(defproject reiddraper/simple-check "0.5.3-SNAPSHOT"
  :description "A QuickCheck inspired property-based testing library."
  :url "http://github.com/reiddraper/simple-check"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies []
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]
                                  [codox-md "0.2.0" :exclusions [org.clojure/clojure]]]}}
  :global-vars {*warn-on-reflection* true}
  :codox {:writer codox-md.writer/write-docs}
  :plugins [[codox "0.6.4"]])
