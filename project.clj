(defproject asana "0.1.0-SNAPSHOT"
  :description "A library for working with the Asana API"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-beta3"]
                 [cheshire "5.4.0"]
                 [com.cemerick/url "0.1.1"]
                 [http-kit "2.1.19"]
                 [camel-snake-kebab "0.3.1"]]
  :profiles {:dev {:dependencies [[speclj "3.2.0"]
                                  [http-kit.fake "0.2.1"]]}}
  :plugins [[speclj "3.2.0"]]
  :test-paths ["spec"])
