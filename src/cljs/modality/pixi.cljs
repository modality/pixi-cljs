(ns modality.pixi)

(def renderer (.autoDetectRenderer js/PIXI 400 300))

(def setup-renderer (fn [selector]
  (let [element (js/jQuery selector)]
    (.empty element)
    (.append element (.-view renderer)))))
