(ns ld29.gui.uis.game-over
  (:use [ld29.gui.uis.core]))

(defn render
  "renders the game state"
  [stage state]
  (let [message (:animated-message state)]
    (format-message message stage)))
