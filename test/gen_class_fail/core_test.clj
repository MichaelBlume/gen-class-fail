(ns gen-class-fail.core-test
  (:require [clojure.test :refer :all]
            [gen-class-fail.core :refer :all]))

(deftest a-test
  (is (= "It's a TheClass" (foo))))
