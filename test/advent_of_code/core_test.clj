(ns advent-of-code.core-test
  (:require [clojure.test :refer :all]
            [advent-of-code.core :refer :all]))

(def input-dia-1 "1abc2
pqr3stu8vwx
a1b2c3d4e5f
treb7uchet")

(deftest test-dia-1
  (testing "Simple input"
    (is (= (dia-1 input-dia-1) 142)))
  )

(def input-dia-1-parte-2 
  "two1nine
eightwothree
abcone2threexyz
xtwone3four
4nineeightseven2
zoneight234
7pqrstsixteen")

(deftest test-dia-1-parte-2
  (testing "segunda parte"
    (is (= (dia-1-parte-2 input-dia-1-parte-2) 281))))

(deftest test-dia-1-parte-2-l1
  (testing "primer linea"
    (is (= (procesar-linea-p2 (first (clojure.string/split-lines input-dia-1-parte-2))) 29))))

(deftest test-dia-1-parte-2-l2
  (testing "segunda linea" 
    (is (= (procesar-linea-p2 (nth (clojure.string/split-lines input-dia-1-parte-2) 1)) 83))))

(deftest test-dia-1-parte-2-l3
  (testing "3ra linea"
    (is (= (procesar-linea-p2 (nth (clojure.string/split-lines input-dia-1-parte-2) 2)) 13))))

(deftest test-dia-1-parte-2-l4
  (testing "4ta linea"
    (is (= (procesar-linea-p2 (nth (clojure.string/split-lines input-dia-1-parte-2) 3)) 24))))

(deftest test-dia-1-parte-2-l5
  (testing "5ta linea"
    (is (= (procesar-linea-p2 (nth (clojure.string/split-lines input-dia-1-parte-2) 4)) 42))))

(deftest test-dia-1-parte-2-l6
  (testing "6ta linea"
    (is (= (procesar-linea-p2 (nth (clojure.string/split-lines input-dia-1-parte-2) 5)) 14))))

(deftest test-dia-1-parte-2-l7
  (testing "7ma linea"
    (is (= (procesar-linea-p2 (nth (clojure.string/split-lines input-dia-1-parte-2) 6)) 76))))
