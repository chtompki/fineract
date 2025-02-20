/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.investor.service;

import org.apache.fineract.investor.data.ExternalOwnerJournalEntryData;
import org.apache.fineract.investor.data.ExternalOwnerTransferJournalEntryData;
import org.apache.fineract.investor.data.ExternalTransferData;
import org.springframework.data.domain.Page;

public interface ExternalAssetOwnersReadService {

    Page<ExternalTransferData> retrieveTransferData(Long loanId, String externalLoanId, String transferExternalId, Integer offset,
            Integer limit);

    ExternalTransferData retrieveTransferData(Long transferExternalId);

    ExternalTransferData retrieveActiveTransferData(Long loanId, String externalLoanId, String transferExternalId);

    ExternalOwnerTransferJournalEntryData retrieveJournalEntriesOfTransfer(Long transferId, Integer offset, Integer limit);

    ExternalOwnerJournalEntryData retrieveJournalEntriesOfOwner(String ownerExternalId, Integer offset, Integer limit);
}
