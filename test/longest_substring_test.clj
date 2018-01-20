(ns longest-substring-test
  (:require [clojure.test :refer :all]
            [longest-substring :refer :all]))

(deftest longest-substr-test
  (testing "longest-substring"
    (is (= (longest-substr "TESTINGTHEMAINSTRING") "GTHEMAINS"))
    (is (= (longest-substr "ABCDEFGHIJKLMNOPQRSTUVWXYZ") "ABCDEFGHIJKLMNOPQRSTUVWXYZ"))
    (is (= (longest-substr "ABCDEFGHIJKLMNOPQDRSTUVWXYZ") "EFGHIJKLMNOPQDRSTUVWXYZ"))
    (is (= (longest-substr "ABCDEABCD") "ABCDE"))
    (is (= (longest-substr "ABCDABCDE") "ABCDE"))))
