package com.github.amirashad


import spock.lang.Specification

class SumRegionSpec extends Specification {

    def "sum region"() {
        given:
        SumRegion sumRegion = new SumRegion(new int[][]{
                [3, 0, 1, 4, 2],
                [5, 6, 3, 2, 1],
                [1, 2, 0, 1, 5],
                [4, 1, 0, 1, 7],
                [1, 0, 3, 0, 5]
        })

        expect:
        sumRegion.sumRegion(r1, c1, r2, c2) == result

        where:
        r1 | c1 | r2 | c2 | result
        2  | 1  | 4  | 3  | 8
        1  | 1  | 2  | 2  | 11
        1  | 2  | 2  | 4  | 12
    }

    def "one more test sum region"() {
        SumRegion sumRegion = new SumRegion(new int[][]{
                [5, 2, 5, 2],
                [3, 6, 3, 6],
                [5, 2, 5, 2],
                [3, 6, 3, 6]
        })

        expect:
        sumRegion.sumRegion(r1, c1, r2, c2) == result

        where:
        r1 | c1 | r2 | c2 | result
        2  | 2  | 3  | 3  | 16
        0  | 0  | 3  | 3  | 64
        1  | 1  | 1  | 1  | 6
    }
}
