(ns all-possible-subsets-test
  (:require [clojure.test :refer :all]
            [all-possible-subsets :refer :all]))

(deftest subsets-test
  (testing "subsets creates all possible subsets of a colleciton"
    (is (= (subsets [1 2 3]) [[] [1] [2] [1 2] [3] [1 3] [2 3] [1 2 3]]))
    (is (= (subsets [1 2]) [[] [1] [2] [1 2]]))))
