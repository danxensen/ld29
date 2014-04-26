(ns ld29.gui.uis.title
  (:import [com.badlogic.gdx.scenes.scene2d.ui Label])
  (:use [ld29.gui.uis.core]))

(def title-ascii-art
  ["ludum dare 29"
   "beneath the surface"
   "xensky and s1lv3rn3k0"])

(defn render-title
  "renders the title art"
  [stage]
  (loop [lines title-ascii-art
         line-number 1]
    (when-not (empty? lines)
      (let [line-label (Label. (first lines) @style)]
        (.setY line-label (- first-line-y (* line-number line-pixel-height)))
        (.setX line-label (* char-pixel-width 16))
        (.addActor stage line-label)
        (recur (rest lines) (inc line-number))))))

(defn render
  "renders the title ui"
  [stage state]
  (let [enter-prompt (Label. "press enter to begin" @style)]
    (render-title @stage)
    (.setY enter-prompt line-pixel-height)
    (.setX enter-prompt (* char-pixel-width 14))
    (.addActor @stage enter-prompt)))
