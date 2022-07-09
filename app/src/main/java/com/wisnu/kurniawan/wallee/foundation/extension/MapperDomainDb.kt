package com.wisnu.kurniawan.wallee.foundation.extension

import com.wisnu.kurniawan.wallee.foundation.datasource.local.model.AccountDb
import com.wisnu.kurniawan.wallee.foundation.datasource.local.model.TransactionDb
import com.wisnu.kurniawan.wallee.model.Account
import com.wisnu.kurniawan.wallee.model.Transaction

fun Account.toAccountDb(): AccountDb {
    return AccountDb(
        id = id,
        currencyCode = currency.code,
        amount = amount.toLong(),
        name = name,
        type = type.value,
        createdAt = createdAt,
        updatedAt = updatedAt
    )
}

fun Transaction.toTransactionDb(accountId: String, transferAccountId: String?): TransactionDb {
    return TransactionDb(
        id = id,
        accountId = accountId,
        categoryName = categoryType?.name,
        currencyCode = currency.code,
        amount = amount.toLong(),
        type = type.name,
        date = date,
        createdAt = createdAt,
        updatedAt = updatedAt,
        note = note,
        transferAccountId = transferAccountId
    )
}