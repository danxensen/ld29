(ns ld29.game.areas.in-ship
  (:use [ld29.game.command]
        [ld29.game.actions]
        [ld29.game.util]
        [ld29.game.areas.seahorse :only [school-in-ship-door-opened
                                         school-in-ship-door-closed]]))


(defentity toilet-brush
  "A toilet brush"
  (make-commands [[:look :toilet-brush]
                  "This is an incredibly sturdy toilet brush. It could even be used as a weapon. "]
                 [[:get :toilet-brush]
                  "You snatch that brush up and weild it fiercely. You are a tiger, a lion, a... sea lion? The point is, it makes you feel pretty darn tough. "
                  (move-entity :toilet-brush :inventory)]))




(defarea in-ship
  "Inside of the weedy ruins of a sunken ship."
  [toilet-brush]
  (make-commands
   [[:look] "There are plentiful weeds and slimy mosses covering all of the surfaces in here as well."
    (cond
     (and (get-area-state :door-opened) (entity-here? :school))
     (school-in-ship-door-opened)
     (entity-here? :school)
     (school-in-ship-door-closed)
     (and (get-area-state :door-opened) (entity-here? :toilet-brush))
     "All that's left in the latrine is the toilet brush."
     )]
   [[:open :door] "As you open the door the silly seahorses begin storming down the drain of the latrine you just accessed for them. "(set-area-state :door-opened true)]                 ))
