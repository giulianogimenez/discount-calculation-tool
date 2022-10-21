(defproject discount-calculator-tool "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :plugins [[lein-midje "3.2.2"]
            [lein-cloverage "1.2.2"]
            [lein-vanity "0.2.0"]
            [s3-wagon-private "1.3.5"]
            [lein-ancient "0.7.0-SNAPSHOT"]]

  :repositories [["central" {:url "https://repo1.maven.org/maven2/" :snapshots false}]
                 ["clojars" {:url "https://clojars.org/repo/"}]])