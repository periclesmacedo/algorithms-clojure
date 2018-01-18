(ns fibonacci-reduce)

(defn fibonacci
  [n]
  (if (or (zero? n) (= 1 n))
    n
    (->> (range 1 n)
         (reduce (fn [coll step]
                  {:prev-num (:fib-num coll)
                   :fib-num (+ (:fib-num coll) (:prev-num coll))})
                {:prev-num 0 :fib-num 1})
         (:fib-num))))

(defn -main
  []
  (time (println (str "Fibonacci of 50: " (fibonacci 50)))))
