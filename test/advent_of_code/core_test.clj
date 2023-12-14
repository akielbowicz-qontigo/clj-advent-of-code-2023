(ns advent-of-code.core-test
  (:require [clojure.test :refer :all]
            [advent-of-code.core :refer :all]))

(def input-simple "1abc2
pqr3stu8vwx
a1b2c3d4e5f
treb7uchet")

(deftest test-dia-1
  (testing "Simple input"
    (is (= (dia-1 input-simple) 142)))
  )
