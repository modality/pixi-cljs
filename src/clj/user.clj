(ns user
  (:require weasel.repl.websocket))


(def repl-env (weasel.repl.websocket/repl-env :ip "0.0.0.0" :port 9001))

;;(cemerick.piggieback/cljs-repl
;;        :repl-env (weasel.repl.websocket/repl-env
;;                   :ip "0.0.0.0" :port 9001))
