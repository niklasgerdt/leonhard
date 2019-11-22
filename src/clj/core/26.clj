(ns core.26)

(defn divide-with-precision [x]
  (with-precision 2013 (/ 1M x)))

(defn decimals [x]
  (subs (str x) 2))

(defn double-check [x]
  (for ))

(defn solve-longest-repeating-seq [x o]
  (loop [p 0]
    (let [a (subs x p (+ p o))
          b (subs x (+ p o) (+ p o o))]
      (cond
        (not= a b) [:fail o a]
        (> (+ 1 p o o) (count x)) [:success o p a]
        :else (recur (inc p))))))

(defn longest-in-result [x y]
  (if (= (x 0) :success)
    (x 3)
    y))

(defn solve-longest-repeating [decimals]
  (loop [hop 1
         longest-known-seq (subs decimals 0 1)]
    (cond
      (>= (+ hop (* hop 2)) (count decimals)) longest-known-seq
      :else (let [solution (solve-longest-repeating-seq decimals hop)]
              (recur (inc hop) (longest-in-result solution longest-known-seq))))))

(defn solve-decimals []
  (for [a (range 2 1001 1)]
    (let [b (divide-with-precision a)
          c (decimals b)
          d (solve-longest-repeating c)]
      {a d})))

