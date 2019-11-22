(ns core.29)

(defn power [base lim]
  (loop [sum (bigint base)
         at lim]
    (cond
      (<= at 1) sum
      :else (recur (* base sum) (dec at)))))

(defn powers [base lim]
  (for [x (range 2 (inc lim))]
    (power base x)))

(defn combinations [lim]
  (for [x (range 2 (inc lim))]
    (powers x lim)))

(defn combine [x]
  (loop [y (first (take 1 x))
         z (drop 1 x)
         v '()]
    (cond
      (empty? y) v
      :else (recur (first (take 1 z)) (drop 1 z) (concat v y)))))

(defn solve []
  (count
    (distinct
      (combine
        (combinations 100)))))
