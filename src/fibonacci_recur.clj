(ns fibonacci-recur)

(defn fibonacci
  [n]
  (if (or (= n 1) (zero? n))
    n
    (loop [prev-num 0
           fib-num 1
           counter 1]
      (if (< counter n)
        (recur fib-num (+ prev-num fib-num) (inc counter))
        fib-num))))

(defn -main
  []
  (time (println (str "Fibonacci of 50: " (fibonacci 50)))))
