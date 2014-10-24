(defproject pixi-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2277"]
                 [weasel "0.3.0"]
                 [com.cemerick/piggieback "0.1.3"]]
  :plugins [[lein-cljsbuild "1.0.3"]
            [cider/cider-nrepl "0.7.0"]
            [com.cemerick/austin "0.1.4"]]
  :source-paths ["src/clj"]
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :cljsbuild {
              :builds [{
                        :id "dev"
                        :source-paths ["src/cljs"]
                        :compiler {
                                   :externs ["resources/public/js/jquery.min.js" "resources/public/js/pixi.js"]
                                   :output-to "resources/public/app.js"
                                   :output-dir "resources/public/out"
                                   :optimizations :none
                                   :source-map true}}]})
