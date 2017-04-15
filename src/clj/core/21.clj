(ns core.21)

(def i (range 1 1000))

(defn  divs [div nom col]
  (if (>= div nom)
    col
    (if (= 0 (mod nom div))
      (recur (inc div) nom (conj col div))
      (recur (inc div) nom col))))

(defn sum [x]
  (reduce + x))

(defn logic [x c]
  (if (empty? x)
    c
    (let [a (first x)
          b (rest x)]
      (recur b (conj {x (reduce + (divs 1 x []))})))))

(defn sums [x s]
  (if (empty? x)
    s
    (let [y (get x (first x))
          z (get x y)]
      (if (= y z)
        (recur (rest x) (+ s y))
        (recur (rest x) s))

    (if (= (get x (first x)) 

(defn -main []

  (logic (range 1 10000) {})
