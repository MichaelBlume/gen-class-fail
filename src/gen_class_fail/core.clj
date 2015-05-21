(ns gen-class-fail.core
  (:import TheClass))

(defn foo []
  (let [i (TheClass.)]
    (str i)))
