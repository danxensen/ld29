(ns ld29.game.dictionary
  (:use [ld29.game.command]))

(defn make-dictionary
  "creates the game dictionary"
  []
  (make-command-dictionary
   [:look ["look" | "view" | "examine" | "inspect" | "check" "out" | "perceive"]]
   [:look-at [:look | "look" "at"]]
   [:get ["get" | "take" | "acquire" | "attain"]]
   [:school ["school" | "seahorses" | "school" "of" "seahorses" | "seahorse"]]
   [:seal ["seal" | "silly" "seal"]]
   [:open ["open" | :look "inside"]]
   [:box ["box" | "cardboard" "box"]]
   [:open-door [:open :door | "turn" :door-knob | "open" :door-knob]]
   [:door ["door" | "portal" | "doorway"]]
   [:door-knob ["door" "knob" | "door" "handle" | "knob" | "handle"]]
   [:ship ["ship" | "sunken" "ship" | "ship" "ruin" | "sunken" "ship" "ruin" | "ship" "ruins" | "sunken" "ship" "ruins"]]
   [:latrine ["latrine" | "water" "closet" | "lavatory" | "bathroom" | "restroom" | "bath" "room" | "rest" "room" | "toilet"]]
   [:toilet-brush ["toilet" "brush" | "brush"]]
   [:shark ["shark"]]
   [:drain ["drain" | "toilet" "drain"]]
   [:great-and-powerful ["great" "and" "powerful" | nil]]
   [:wizard [:great-and-powerful "wizard" | :great-and-powerful "sea" "wizard" | :great-and-powerful "wizard" :mermaid | :great-and-powerful :mermaid "wizard" | :great-and-powerful "magic" :mermaid | :great-and-powerful "magic" "man" | :great-and-powerful "mer-wizard" | :great-and-powerful "merwizard"]]
   [:fedora ["hat" | "fedora" | "stupid" :fedora | "magic" "fedora" | "magic" "hat"]]
   [:beard ["beard" | "neckbeard"]]
   [:gills ["gill" | "gills"]]
   [:slime ["slime" | "goo"]]
   [:mermaid ["mermaid" | "mermaids" | "merman" | "mermen" | "merperson"]]
   [:merfolk ["merfolk" | "merpeople"]]
   [:fin ["fin" | "fins" | "tail" | "tails" | "flipper" | "flippers"]]
   [:curse ["curse" | "hex"]]
   [:topless-mermaid [:mermaid | "topless" :mermaid | "naked" :mermaid | "nude" :mermaid]]
   [:top ["top"]]
   [:teenage-mermaid [:mermaid | "teen" :mermaid | "teenage" :mermaid]]
   [:clergy-merman [:mermaid | "clergy" :mermaid | "clergyman" :mermaid | "clergy" | "clergyman"]]
   [:murky-water ["murky" "water" | "dirty" "water" | "murk"]]
   [:mercentaur ["centaur" | "mer-centaur" | "mercentaur"]]
   [:north ["north" | "n"]]
   [:south ["south" | "s"]]
   [:east ["east" | "e"]]
   [:west ["west" | "w"]]
   [:up ["up" | "upward"]]
   [:surface [:go :up | "ascend" | "surface"]]
   [:go ["go" | "swim" | "walk"]]
   [:talk ["talk" | "greet" | "converse" | "talk" "to" | "converse" "with"]]
   [:ask ["ask" | "question" | "inquire"]]
   [:about ["about" | nil]]
   [:favour ["favor" | "favour" | "quest" | "task" | "chore"]]
   [:removing ["removing" | "to" "remove" | nil]]
   ))
