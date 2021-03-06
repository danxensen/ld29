(ns ld29.game.util
  (:use [ld29.game.command]))

; (defentity thing (make-commands) state)
(defmacro defentity
  "defines an entity"
  ([name description commands]
     `(defentity ~name ~description ~commands {}))
  ([name description commands state]
     `(defn ~name []
        {:id (keyword '~name) :description ~description :commands ~commands :state ~state})))

; (defarea place "description" [entities] (make-commands) state)
(defmacro defarea
  "defines an area"
  ([name description entities commands]
     `(defarea ~name ~description ~entities ~commands {}))
  ([name description entities commands state]
     ; evaluate the entity fns to create the entity list
     (let [entities (zipmap (map keyword entities) (map list entities))]
       `(defn ~name []
          {:id (keyword '~name) :description ~description :entities ~entities :commands ~commands :state ~state}))))
