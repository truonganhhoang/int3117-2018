describe('Test Exam', function () {
    it('Access to the page', function () {
        cy.visit('https://hoclieu.sachmem.vn/folder/L%E1%BB%9Bp_3-5a4b188848150cd8b9065234');
    });
    it('Choosse Tiếng Anh 3 Tập 2', function () {
        cy.contains('Tiếng Anh 3 Tập 2').click();
    });
    it('Do exam', function () {
        //chon hinh thuc tra loi
        it('Choosse type', function () {
            cy.contains('Làm từng câu').click();
        });

        //lam bai
        cy.get('div[class="options col-md-6 col-xs-12 mt-2 ng-star-inserted"] div:first').click();
        cy.contains('Chốt').click();
        cy.get('button[title="Câu tiếp"]').click();

        cy.get('div[class="options col-md-6 col-xs-12 mt-2 ng-star-inserted"] div:first').click();
        cy.contains('Chốt').click();
        cy.get('button[title="Câu tiếp"]').click();

        cy.get('div[class="options col-md-6 col-xs-12 mt-2 ng-star-inserted"] div:first').click();
        cy.contains('Chốt').click();
        cy.get('button[title="Câu tiếp"]').click();

        cy.get('div[class="options col-md-6 col-xs-12 mt-2 ng-star-inserted"] div:first').click();
        cy.contains('Chốt').click();
        cy.get('button[title="Câu tiếp"]').click();

        cy.get('div[class="options col-md-6 col-xs-12 mt-2 ng-star-inserted"] div:first').click();
        cy.contains('Chốt').click();
        cy.get('button[title="Câu tiếp"]').click();
        //nop bai
        cy.get('.btn-warning').click()
    });
});