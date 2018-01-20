(ns longest-substring
  (:require [clojure.string :as string]))

(defn non-repeating-substr
  "substring that ends before the next character c"
  [string]
  (loop [max-subs         ""
         remaining-string string]
    (if (string/includes? max-subs (str (first remaining-string)))
      max-subs
      (recur (str max-subs (first remaining-string)) (subs remaining-string 1)))))

(defn select-longest
  [longest-subs new-subs]
  (if (>= (count longest-subs) (count new-subs))
    longest-subs
    new-subs))

(defn longest-substr
  [s]
  (loop [remaining-s s
         longest     ""]
    (if (empty? (subs remaining-s 1))
      longest
      (let [current-subs (non-repeating-substr remaining-s)
            longest-subs (select-longest longest current-subs)]
        (recur (subs remaining-s 1) longest-subs)))))

(defn -main
  []
  (time (println (str "the longest substring without reapeating characters "
                      "from TESTINGTHEMAINSTRING IS: "
                      (longest-substr "TESTINGTHEMAINSTRING")))))
