(ns core.28)

(defn solve []
      (loop [sum 4
             cursor 3
             rowlen 2
             steps 0
             turns 0]
            (cond
              (and (= rowlen 1001) (= turns 3)) sum
              (and (= rowlen steps) (= turns 0)) (recur (+ sum cursor) (inc cursor) rowlen 1 (inc turns))
              (and (= rowlen steps) (= turns 1)) (recur (+ sum cursor) (inc cursor) (inc rowlen) 1 (inc turns))
              (and (= rowlen steps) (= turns 2)) (recur (+ sum (dec cursor)) (inc cursor) rowlen 1 (inc turns))
              (and (= rowlen steps) (= turns 3)) (recur (+ sum cursor) (inc cursor) (inc rowlen) 1 0)
              :else (recur sum (inc cursor) rowlen (inc steps) turns))))