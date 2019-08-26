package xyz.iamraj.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class MissingSequenceNumber {

    public static void main(String[] args) {
        Long preSeq = 2L;
        List<Long> allSequenceNumber = Arrays.asList(3L,4L,6L,8L,9L,10L);

        System.out.println(getAllMissedSequence(preSeq,allSequenceNumber));

    }
    static List<Long> getAllMissedSequence(long longPreSeqNo, List<Long> allSeqNumbers){
        List<Long> missingNumbers;
        long bound = allSeqNumbers.get(allSeqNumbers.size() - 1);
        //missingNumbers =

        return LongStream.range(longPreSeqNo + 1, bound).filter(number -> !allSeqNumbers.contains(number)).boxed().collect(Collectors.toList());
    }
}
