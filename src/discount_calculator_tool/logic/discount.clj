(ns discount-calculator-tool.logic.discount)

(defn apply-discount [value discount-value]
  (- value discount-value))

(defn close-bill[value]
  (if(discount-calculator-tool.logic.discount-rules/allow-discount? value)
    (let [discount-value (discount-calculator-tool.logic.discount-rules/calculate-discount value)]
      (apply-discount value (* discount-value (/ value 100))))
    value))