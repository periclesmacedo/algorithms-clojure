(ns fibonacci-reduce-test
  (:require [clojure.test :refer :all]
            [fibonacci-reduce :refer :all]))

(deftest fibonacci-test
  (testing "fibonacci values"
    (is (= (fibonacci 0) 0))
    (is (= (fibonacci 1) 1))
    (is (= (fibonacci 3) 2))
    (is (= (fibonacci 10) 55))
    (is (= (fibonacci 50) 12586269025))))
