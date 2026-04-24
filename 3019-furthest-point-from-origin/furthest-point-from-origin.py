class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        a = moves.count('L')
        b = moves.count('R')
        c = moves.count('_')
        return max(abs(a+c-b),abs(b+c-a))