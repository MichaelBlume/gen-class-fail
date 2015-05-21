(ns gen-class-fail.class
  (:gen-class
    :name TheClass))

(defn -toString [_]
  (str "It's a TheClass"))
