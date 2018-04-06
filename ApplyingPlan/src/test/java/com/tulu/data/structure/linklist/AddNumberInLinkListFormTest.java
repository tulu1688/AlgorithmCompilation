package com.tulu.data.structure.linklist;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddNumberInLinkListFormTest {
    @Test
    public void test__addNumber(){
        assertEquals(10, LinkListUtil.getNumberValue(
                AddNumberInLinkListForm.addNumber(
                        LinkListUtil.getNumberInLinkList(4),
                        LinkListUtil.getNumberInLinkList(6)
                )
        ));

        assertEquals(10004, LinkListUtil.getNumberValue(
                AddNumberInLinkListForm.addNumber(
                        LinkListUtil.getNumberInLinkList(4),
                        LinkListUtil.getNumberInLinkList(10000)
                )
        ));

        assertEquals(10004, LinkListUtil.getNumberValue(
                AddNumberInLinkListForm.addNumber(
                        LinkListUtil.getNumberInLinkList(10000),
                        LinkListUtil.getNumberInLinkList(4)
                )
        ));

        assertEquals(1210, LinkListUtil.getNumberValue(
                AddNumberInLinkListForm.addNumber(
                        LinkListUtil.getNumberInLinkList(99),
                        LinkListUtil.getNumberInLinkList(1111)
                )
        ));
    }

}