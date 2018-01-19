(ns all-possible-subsets)

(defn add-subsets [coll, item]
  (->> coll
       (map #(conj %  item))
       (concat coll)))

(defn subsets
  [full-set]
  (vec (reduce add-subsets [[]] full-set)))

(defn -main
  []
  (time (println (str "all possible subsets of [1 2 3]: " (subsets [1 2 3])))))
