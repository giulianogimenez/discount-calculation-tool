(ns discount-calculator-tool.logic.discount-rules-test
  (:require [clojure.test :refer [deftest are testing]]
            [discount-calculator-tool.logic.discount-rules]))

(deftest allow-discount-rules
  (testing "when value is above $100 should return true"
    (is(true?
      (discount-calculator-tool.logic.discount-rules/allow-discount? 100))))
    (is(false?
      (discount-calculator-tool.logic.discount-rules/allow-discount? 99))))

(deftest discout-rules-test
  (testing "given a value of the transaction, when the value is between $100, $1000 and $10000, should categorize the discount"
    (are [discount expected] (= expected
      (discount-calculator-tool.logic.discount-rules/calculate-discount discount))
      99 0
      100 5
      1000 7
      10000 10)))