package com.mucommander.commons.file.archive.sevenzip.provider.SevenZip.Archive.SevenZip;
import com.mucommander.commons.file.archive.sevenzip.provider.Common.RecordVector;
import com.mucommander.commons.file.archive.sevenzip.provider.SevenZip.Archive.Common.BindInfo;



class BindInfoEx extends BindInfo {
    
    RecordVector<MethodID> CoderMethodIDs = new RecordVector<MethodID>();
    
    public void Clear() {
        super.Clear(); // CBindInfo::Clear();
        CoderMethodIDs.clear();
    }
}
