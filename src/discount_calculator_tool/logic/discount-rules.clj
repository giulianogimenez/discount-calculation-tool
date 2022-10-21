(ns discount-calculator-tool.logic.discount-rules)

(defn allow-discount? [value]
  (>= value 100))

(defn calculate-discount :- Integer [value]
  (if (>= value 10000) 10
  (if (>= value 1000) 7
  (if (>= value 100) 5))))