package com.study.fallback;

import com.study.client.LibraryServiceClient;
import com.study.common.dto.library.LibraryBookResponse;
import com.study.common.dto.library.LibraryResponse;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component

public class LibraryServiceFallback implements LibraryServiceClient {

    @Override
    public LibraryBookResponse checkBookAvailability(UUID libraryUid, UUID bookUid) {
        // 返回默认的 LibraryBookResponse 对象
        LibraryBookResponse response = new LibraryBookResponse();
        response.setBookUid(bookUid);
        response.setAvailableCount(0);  // 默认不可用
        return response;
    }

    @Override
    public LibraryResponse getLibraryInfo(UUID libraryUid) {
        // 返回默认的 LibraryResponse 对象
        LibraryResponse response = new LibraryResponse();
        response.setLibraryUid(libraryUid);

        return response;
    }

    @Override
    public void borrowBookAvailability(UUID libraryUid, UUID bookUid) {
        // 默认情况下，什么也不做
        // 可以在这里记录日志，或者是做一些其它处理
    }

    @Override
    public void returnBookAvailability(UUID libraryUid, UUID bookUid) {
        // 默认情况下，什么也不做
        // 同样可以记录日志或者其他处理
    }
}
