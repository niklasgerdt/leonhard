(ns core.21)

(defn divs [div nom col]
  "returns proper dividers as seq
  params divider, nominator, seq of dividers"
  (if (> div nom)
    col
    (if (= 0 (mod nom div))
      (recur (inc div) nom (conj col div))
      (recur (inc div) nom col))))

(defn int-dividers-map [s  m]
  "finds sums of proper dividers and returns map of int -> sum(dividers)"
  (if (empty? s)
    m 
    (let [f (first s)
          r (rest s)
          z (reduce + (divs 1 f []))
          mz (conj m {f z})]
      (recur r mz))))

(defn amicable-numbers [m v]
  "amicable numbers as vector from map"
  (if (empty? m)
    v
    (let [y (key (first m))
          z (get m y)
          x (get m z)
          r (dissoc m y)]
      (if (and (= y x) (not= y z))
        (recur r (conj v y z))
        (recur r v)))))

