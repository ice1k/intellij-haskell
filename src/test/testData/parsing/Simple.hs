module Simple where

import Data.List

f :: Int
f = 1

suc :: Int -> Int
suc n = succ n

fib :: [Int]
fib = 0 : 1 : zipWith (+) fib (tail fib)
