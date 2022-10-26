(ns discount-calculator-tool.logic.discount-rules)

(defn allow-discount? [value]
  (>= value 100))

(defn calculate-discount [value]
  (cond
    (>= value 10000) 10
    (>= value 1000) 7
    (>= value 100) 5))