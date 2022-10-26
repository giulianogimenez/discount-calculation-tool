(ns discount-calculator-tool.logic.discount-rules-test
  (:require [clojure.test :refer [deftest is testing]]
            [discount-calculator-tool.logic.discount-rules]))

(deftest allow-discount-rules
  (testing "when value is above $100 should return true"
    (is(true?
      (discount-calculator-tool.logic.discount-rules/allow-discount? 100))))
    (is(false?
      (discount-calculator-tool.logic.discount-rules/allow-discount? 99))))

(deftest discout-rules-test
  (testing "given a value of the transaction, when the value is between $100, $1000 and $10000, should categorize the discount"
    (is(nil?
          (discount-calculator-tool.logic.discount-rules/calculate-discount 99)))
    (is(= 5
         (discount-calculator-tool.logic.discount-rules/calculate-discount 100)))
    (is(= 7
        (discount-calculator-tool.logic.discount-rules/calculate-discount 1000)))
    (is(= 10
          (discount-calculator-tool.logic.discount-rules/calculate-discount 10000)))))